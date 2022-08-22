import React from "react";
import { ReactDOM } from "react-dom";
import HomeSlider from "../HomeSlider";


it("renders without crashing", () =>{
    const div = document.createElement("div");
    ReactDOM.render(<HomeSlider></HomeSlider>,div)
})

