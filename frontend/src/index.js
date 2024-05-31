
import ReactDOM from 'react-dom/client';
// import App from './App';
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Nav from "./components/Nav.jsx";
import Home from "./components/Home.jsx";
import Products from "./components/Products.jsx";
import NotFound from "./components/Notfound.jsx";

ReactDOM.createRoot(
    document.getElementById("app")
)
.render(
    <Router>
        <div>
           <Nav />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/products" element={<Products />} />
                <Route path="*" element={<NotFound />} />
            </Routes>
        </div>
    </Router>
);
// const root = ReactDOM.createRoot(document.getElementById('app'));
// root.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>
// );

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();
