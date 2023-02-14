
import React,{useState} from "react";
import  './App.css';

function App() {
  const [result,setResult]=useState("");
  function handleClick(e){
    setResult(result.concat(e.target.name));
  }
  function clear(){
    setResult("");
  }
  function backspace(){
    setResult(result.slice(0,-1));
  }
  function calculateResult(){
    console.log(typeof(result));   
    
    fetch("http://localhost:8080/calculate",{
      method:"POST",
      headers: { "Content-Type": "application/json" },
      body: result,
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  return (
    <div className="mainapp">
    <div className="calc-app">
      <h4>Standard Calculator</h4>
      <form>
        <input type="text" value={result}></input>
      </form>
      <div className="keypad">
        <button onClick={clear} id="clear">Clear</button>
        <button onClick={backspace} id="backspace">backspace</button>
        <button name="%" onClick={handleClick} id="mod">%</button>
        <button name="**0.5" onClick={handleClick} id="root">√x</button>
        <button name="**2"onClick={handleClick} id="sqrt">x²</button>
        <button name="/"onClick={handleClick} id="divide">/</button>
        <button name="7"onClick={handleClick}>7</button>
        <button name="8"onClick={handleClick}>8</button>
        <button name="9"onClick={handleClick}>9</button>
        <button name="*"onClick={handleClick} id="multiply">x</button>
        <button name="4"onClick={handleClick}>4</button>
        <button name="5"onClick={handleClick}>5</button>
        <button name="6"onClick={handleClick}>6</button>
        <button name="-"onClick={handleClick} id="subs">-</button>
        <button name="1"onClick={handleClick}>1</button>
        <button name="2"onClick={handleClick}>2</button>
        <button name="3"onClick={handleClick}>3</button>
        <button name="+"onClick={handleClick} id="add">+</button>
        <button name="0"onClick={handleClick}>0</button>
        <button name="."onClick={handleClick}>.</button>
        <button id="result" onClick={calculateResult}>=</button>
      </div>
    </div>
    </div>
  );
}

export default App;
