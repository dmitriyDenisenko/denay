import React from "react";
import {Link}  from "react-router-dom";
 
export default function Nav(){
    return <div>
            <Link to="/">Главная</Link> 
            <Link to="/products">Товары</Link>
        </div>;
}