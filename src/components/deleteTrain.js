import React, { Component } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import AdminNavigationBar from "../components/adminNavigationBar";

export default class deleteTrain extends Component {
  state = {
    alertMessage: String
  };

  componentDidMount() {
    axios
      .post(
        "http://localhost:8082/trains/delete/{trainid}" +
          this.props.match.params.id
      )
      .then(response => {
        this.setState({
          alertMessage: "Train Deleted Successfully"
        });
      })
      .catch(error => console.log(error.message));
  }

  render() {
    return (
      <div>
        <AdminNavigationBar />
        <br /> <br />
        <div className="alert alert-success" role="alert">
          <h4 className="alert-heading">Well done!</h4>
          <h1>{this.state.alertMessage}</h1>
          <hr />
          <h3 className="mb-0">
            <Link to={"/trainlist"}> Go Back To Your Train List.</Link>
          </h3>
        </div>
      </div>
    );
  }
}