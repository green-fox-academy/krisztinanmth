import React from 'react';
import { NavLink } from 'react-router-dom';

const NavBar = () => (
  <nav>
    <NavLink to="/simple/states">with states</NavLink>
    <NavLink to="/simple/redux">with redux</NavLink>
  </nav>
);

export default NavBar;
