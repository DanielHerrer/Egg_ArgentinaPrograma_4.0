import React, { useEffect, useState } from 'react';
import { Link, useParams, useLocation } from 'react-router-dom';
import RickAndMortyService from '../../services/RickAndMorty.service';

export const Detail = () => {

  const [personaje, setPersonaje] = useState({});
  const { id } = useParams();
  const { pathname } = useLocation();

  useEffect(() => {
    console.log(pathname);
    RickAndMortyService.getCharacterById(id)
      .then((data) => setPersonaje(data));
  }, []);

  return (
    <div className="row mb-3">
      <div className="col=md-12">
        <div className="card flex-md-row mb-4 box-shadow h-md-250">
            <div className="card-body d-flex flex-column aling-item-start">
                <strong className="d-inline-block mb-2 text-secondary"> {personaje.gender} </strong>
                <h3 className="mb-0 text-dark"> {personaje.name} </h3>
                <div className="mb-1 text-muted"> {new Date(personaje.created).toLocaleDateString()} </div>
                <div className="mb-1 text-muted"></div>
                <ul className="list-group mt-1">
                    <li className="list-group-item"><b class="text-primary">Status:</b> {personaje.status}</li>
                    <li className="list-group-item"><b class="text-primary">Specie:</b> {personaje.species}</li>
                    <li className="list-group-item"><b class="text-primary">Type:</b> {personaje.type ? personaje.type : 'Unknown'}</li>
                    <li className="list-group-item"><b class="text-primary">Origin:</b> {personaje.origin ? personaje.origin.name : 'Unknown'}</li>
                    <li className="list-group-item"><b class="text-primary">Location:</b> {personaje.location ? personaje.location.name : 'Unknown'}</li>
                </ul>

                <Link to={"/"} className="mt-3 btn btn-primary btn-lg">Volver</Link>
            </div>
            <img className="h-100 d-inline-block rounded card-img-right flex-auto d-none d-md-block m-4" height="auto" src={personaje.image} alt=""/>
        </div>
      </div>
    </div>
  )
}