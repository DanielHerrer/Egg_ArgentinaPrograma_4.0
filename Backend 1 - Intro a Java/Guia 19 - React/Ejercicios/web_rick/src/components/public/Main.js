import React, { Component } from "react";
import { Cards } from './Cards';

export class Main extends Component {
  
  // constructor(props) {
  //   super(props);
  // }

  // componentDidMount() {
  // }

  render() {
    return (
      <main>
        <section className="text-center container">
          <div className="row py-lg-5">
            <div className="col-lg-6 col-md-8 mx-auto">
              <h1 className="fw-light">Rick & Morty</h1>
              <p className="lead text-body-secondary">
                La serie sigue las desventuras de un científico, Rick Sanchez, y su fácilmente influenciable nieto, 
                Morty, quienes pasan el tiempo entre la vida doméstica y los viajes espaciales, temporales e intergalácticos.
              </p>
              {/* <p>
                <a href="#" className="btn btn-primary my-2">
                  Main call to action
                </a>
                <a href="#" className="btn btn-secondary my-2">
                  Secondary action
                </a>
              </p> */}
            </div>
          </div>
        </section>

        <Cards/>

      </main>
    );
  }
}

/**
 * Leandro Arana (codigo para visualizar info de cada card de rick & morty) 
<div className="row mb-3">
  <div className="col=md-12">
    <div className="card flex-md-row mb-4 box-shadow h-md-250">
        <div className="card-body d-flex flex-column aling-item-start">
            <strong className="d-inline-block mb-2 text-success"> {mascota.species} </strong>
            <h3 className="mb-0 text-dark"> {mascota.name} </h3>
            <div className="mb-1 text-muted"> {new Date(mascota.created).toLocaleDateString()} </div>
            <div className="mb-1 text-muted"></div>
            <p className="card-text mb-auto">This is a wider card with supporting text below as
                a natural lead-in to additional content.
                This content is a little bit longer.</p>
            <ul className="list-group mt-1">
                <li className="list-group-item"> blas dsaq aa</li>
                <li className="list-group-item">cuca monga fut</li>
                <li className="list-group-item">sale vale ret</li>
                <li className="list-group-item">mico fero hae</li>
                <li className="list-group-item">tien nasr meure</li>
            </ul>

            <Link to={"/"} className="mt-3 btn btn-primary btn-lg">Volver</Link>
        </div>
        <img className="h-100 d-inline-block rounded card-img-right flex-auto d-none d-md-block m-4" height="auto" src={mascota.image} alt=""/>
    </div>
  </div>
</div>
*/