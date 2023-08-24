import React from 'react';
import { Link } from 'react-router-dom';

export const Card = ({personaje}) => {
  return (
    <div className="col">
        <div className="card shadow-sm">
            
            <img width="100%" src={personaje.image} alt="Imagen del personaje"/>
            
            <strong className="d-inline-block mt-2 ms-3 text-success"> {personaje.species} </strong>
            <h3 className="ms-3 mb-0 text-dark"> {personaje.name} </h3>

            <div className="card-body">
                <div className="d-flex justify-content-end align-items-center">
                    <div className="btn-group">
                        <button type="button" className="btn btn-sm btn-outline-primary">
                            <Link to={`/detail/${personaje.id}`} className="nav-link px-3 text-primary">Detalles</Link>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

// import React, { useEffect, useState } from 'react'
// import { Link, useLocation, useParams } from 'react-router-dom'
// import RickAndMortyService from '../../services/RickAndMorty.service';