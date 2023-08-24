import React, { useState } from "react";
import { Link } from 'react-router-dom';

export const Footer = () => {

  const [click, hacerClick] = useState(0);
  
  const sumarClicks = () => {
    hacerClick(click + 1)
  }
  const restarClicks = () => {
    hacerClick(click - 1)
  }

  const year = new Date().getFullYear();
  const company = "EGG Education";

  return (
    <div className="container">
      <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p className="col-md-4 mb-0 text-muted">&copy; {year} {company} → {click}</p>
    
        <button className="btn btn-sm btn-outline-success" onClick={sumarClicks}>Sumar clicks</button>
        <button className="btn btn-sm btn-outline-danger" onClick={restarClicks}>Restar clicks</button>

        <ul className="nav col-md-4 justify-content-end">
          <Link to="/" className="nav-item nav-link px-2 text-body-secondary" style={{ textDecoration: 'none' }}><li>Home</li></Link>
          <Link to="/user-form" className="nav-item nav-link px-2 text-body-secondary" style={{ textDecoration: 'none' }}><li>Formulary</li></Link>
          <li className="nav-item"><a href="https://github.com/DanielHerrer" className="nav-link px-2 text-body-secondary" target="_blank" rel="noopener noreferrer">About</a></li>
        </ul>
      </footer>
    </div>
  );
};