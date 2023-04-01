1.Create a Java Thread Executor Pool to read & write from a Thread-safe queue

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueThreadExecutor {

    private final ExecutorService executorService;
    private final LinkedBlockingQueue<String> queue;

    public QueueThreadExecutor(int numOfThreads) {
        queue = new LinkedBlockingQueue<>();
        executorService = Executors.newFixedThreadPool(numOfThreads);

        for (int i = 0; i < numOfThreads; i++) {
            executorService.submit(new QueueWorker(queue));
        }
    }

    public void addMessageToQueue(String message) {
        queue.offer(message);
    }

    public void shutDownExecutor() {
        executorService.shutdown();
    }

    private static class QueueWorker implements Runnable {
        private final LinkedBlockingQueue<String> queue;

        public QueueWorker(LinkedBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = queue.take(); // wait for a message to become available
                    // do something with the message (e.g., write it to a file or process it)
                    System.out.println("Message processed: " + message);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

Here  we create a QueueThreadExecutor class that takes an integer argument numOfThreads in the constructor, which specifies the number of threads that we want to use to process messages from the queue.

We create a LinkedBlockingQueue instance named queue to hold the messages that we want to process. We also create an ExecutorService instance named executorService using Executors.newFixedThreadPool to create a thread pool with the specified number of threads.

In the constructor, we create numOfThreads QueueWorker instances and submit them to the executorService. Each QueueWorker instance takes the queue instance as a constructor argument.

The addMessageToQueue method is used to add messages to the queue. We use the LinkedBlockingQueue.offer method to add a message to the queue.

The shutDownExecutor method is used to shut down the executorService.

The QueueWorker class is a nested class that implements the Runnable interface. The run method is called when a QueueWorker instance is submitted to the executorService. The run method repeatedly waits for a message to become available in the queue using the LinkedBlockingQueue.take method. Once a message is available, the QueueWorker instance processes the message (e.g., writes it to a file or processes it in some way) and prints a message to the console. The run method catches the InterruptedException that is thrown when the thread is interrupted and sets the thread's interrupted status.




