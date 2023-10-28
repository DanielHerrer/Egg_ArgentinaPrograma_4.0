import React from 'react';
import { Link } from 'react-router-dom';

export const Navbar = () => {
  return (
    <header className="p-3 text-bg-dark">
      <div className="container">
        <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">

          <div className="logoContainer d-flex align-items-center mb-2 mb-lg-0 mx-3 text-white text-decoration-none">
            <img className="App-logo" height="52" src="logatzo.png" alt=""/>
          </div>

          <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
            <Link to="/" className="nav-link px-2 text-white" style={{ textDecoration: 'none' }}><li>Home</li></Link>
            <Link to="/user-form" className="nav-link px-2 text-white" style={{ textDecoration: 'none' }}><li>Formulary</li></Link>
            <li><a href="https://github.com/DanielHerrer" className="nav-link px-2 text-white" target="_blank" rel="noopener noreferrer">About</a></li>
          </ul>

          <form className="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
            <input type="search" className="form-control form-control-dark text-bg-dark" placeholder="Search..." aria-label="Search"/>
          </form>

          <div className="text-end">
            <button type="button" className="btn btn-outline-light me-2">Login</button>
            <button type="button" className="btn btn-warning">Sign-up</button>
          </div>
        </div>
      </div>
    </header>
  );
};