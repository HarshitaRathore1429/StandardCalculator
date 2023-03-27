import Calculator from "./component/Calculator";
import Datefunction from "./component/Datefunction";
import {Routes,Route,Link} from 'react-router-dom';
import './App.css';

function App() {
  return (
    <div className="App">   
            <ul className="App-header">
              <li>
                <Link to="/" style={{"textDecoration":"none","color":"black"}} >Standard Calculator</Link>
              </li>
              <li>
                <Link to="/date"  style={{"textDecoration":"none","color":"black"}}>Date Calculator</Link>
              </li>
            </ul>           
           <Routes>
                 <Route path='/' element={< Calculator />}></Route>
                 <Route path='/date' element={< Datefunction />}></Route>
          </Routes>
    </div>
  );
}

export default App;
