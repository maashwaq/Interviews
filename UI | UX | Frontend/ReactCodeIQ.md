ReactJS code interview question without knowing the level of experience of the candidate. 
However, here are some sample ReactJS code questions that might be asked in an interview:

Create a functional component called Greeting that takes a prop called name and returns a greeting message that says "Hello, {name}!".

import React from 'react';

function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

Create a class component called Counter that has a state variable called count initialized to 0. Add two buttons, one that increments the count by 1 and one that decrements the count by 1.

import React from 'react';

class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  render() {
    return (
      <div>
        <h1>Count: {this.state.count}</h1>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
      </div>
    );
  }
}

Create a higher-order component called withLogger that takes a component as an argument and returns a new component that logs when the component is mounted and unmounted.

import React from 'react';

function withLogger(WrappedComponent) {
  return class extends React.Component {
    componentDidMount() {
      console.log(`Component ${WrappedComponent.name} mounted`);
    }

    componentWillUnmount() {
      console.log(`Component ${WrappedComponent.name} unmounted`);
    }

    render() {
      return <WrappedComponent {...this.props} />;
    }
  };
}

export default withLogger;

Create a custom hook called useFetch that takes a URL as an argument and returns an object with a data property that contains the fetched data and a loading property that is true while the data is being fetched.

import { useState, useEffect } from 'react';

function useFetch(url) {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function fetchData() {
      const response = await fetch(url);
      const data = await response.json();
      setData(data);
      setLoading(false);
    }
    fetchData();
  }, [url]);

  return { data, loading };
}

export default useFetch;

These are just a few examples of the types of ReactJS code questions that might be asked in an interview. The specific questions and level of complexity will depend on the role and experience level of the candidate.

