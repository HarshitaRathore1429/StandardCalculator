import React,{useState} from "react";
import './calculator.css'
function Calculator()
{
    const [result,setResult]=useState("");
  function handleClick(e){
    setResult(result.concat(e.target.name));
  }
  
  console.log(result);
  function clear(){
    setResult("");
  }
  function backspace(){
    setResult(result.slice(0,-1));
  }
  function calculateResult(){
   // console.log(operator);
    //console.log(typeof(result));   
    var myArray=result.split(/[-,+,/,*,%,x,√,s,^,t,c,!,l,b,g,v,π]/);
    const num1=myArray[0];
    const operator=result.match(/[-,+,/,*,%,x,√,s,^,t,c,!,l,b,g,v,π]/);
    const operator1=operator[0];
    const num2=myArray[1];
    const total="";
    const calc={num1,operator1,num2,total}
    console.log(operator1);
    console.log(calc);
    if(operator1==="+")
    {
    fetch("http://localhost:8080/calculator/add",{
      method:"POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="-")
  {
    fetch("http://localhost:8080/calculator/substract",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="/")
  {
    fetch("http://localhost:8080/calculator/divide",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="*")
  {
    fetch("http://localhost:8080/calculator/multiply",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
   if(operator1==="%")
  {
    fetch("http://localhost:8080/calculator/modulus",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="x")
  {
    fetch("http://localhost:8080/calculator/square",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="√")
  {
    fetch("http://localhost:8080/calculator/underroot",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="s")
  {
    fetch("http://localhost:8080/calculator/sin",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="c")
  {
    fetch("http://localhost:8080/calculator/cos",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="t")
  {
    fetch("http://localhost:8080/calculator/tan",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="!")
  {
    fetch("http://localhost:8080/calculator/factorial",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }if(operator1==="l")
  {
    fetch("http://localhost:8080/calculator/log1",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="π")
  {
    fetch("http://localhost:8080/calculator/pi",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="g")
  {
    fetch("http://localhost:8080/calculator/log",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
  if(operator1==="^")
  {
    fetch("http://localhost:8080/calculator/power",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(calc),
    }).then(res =>res.json()).then((result) =>setResult(result));
  }
}
function mS()
{
  const saved=result;
  const memory={saved}
  console.log(memory);
  fetch("http://localhost:8080/calculator/mS",{
    method:"POST",
    headers: {
      'Accept': 'application/json, text/plain, */*',
    'Content-Type': 'application/json'
  },
    body:JSON.stringify(memory),
  }) 
  console.log(memory);
}
function mR()
{
 // const saved=result;
  //const memory={saved}
  fetch("http://localhost:8080/calculator/mR",{
    method:"GET",
    headers:{
      'Accept': 'application/json, text/plain, */*',
    'Content-Type': 'application/json'
    }
  }).then(res =>res.json()).then((result) =>setResult(result));
}
function mC()
{
  const saved=result;
  const memory={saved}
  fetch("http://localhost:8080/calculator/mC",{
    method:"Delete",
    headers:{
      'Accept': 'application/json, text/plain, */*',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(memory),
  }).then(res =>res.json()).then((result) =>setResult(result));
}
function m()
{
  const saved=result;
  const memory={saved}
  fetch("http://localhost:8080/calculator/m+",{
    method:"Post",
    headers:{
      'Accept': 'application/json, text/plain, */*',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(memory),
  }).then(res =>res.json()).then((result) =>setResult(result));
}
function Msub(){
  const saved=result;
  const memory={saved}
  fetch("http://localhost:8080/calculator/m-",{
    method:"Post",
    headers:{
      'Accept': 'application/json, text/plain, */*',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(memory),
  }).then(res =>res.json()).then((result) =>setResult(result));
}
  return (
   
    <div className="calc-app">
      <h4>Standard Calculator</h4>
      <form>
        <input type="text" value={result}></input>
      </form>
      <div className="keypad">
        <button onClick={clear} id="clear">Clear</button>
        <button onClick={backspace} id="backspace">backspace</button>
        <button name="sin" onClick={handleClick} id="sin">sin</button>
        <button name="tan" onClick={handleClick} id="tan">tan</button>
        <button name="cos" onClick={handleClick} id="cos">cos</button>
        <button name="MS" onClick={mS} id="ms">MS</button>
        <button name="MR" onClick={mR} id="mr">MR</button>
        <button name="MC" onClick={mC} id="mc">MC</button>
        <button name="M+" onClick={m} id="m+">M+</button>
        <button name="M-" onClick={Msub} id="m-">M-</button>
        <button name="!" onClick={handleClick} id="fact">n!</button>
        <button name="l" onClick={handleClick} id="log1">log10</button>
        <button name="π" onClick={handleClick} id="π">π</button>
        <button name="g" onClick={handleClick} id="log">In</button>
        <button name="^" onClick={handleClick} id="power">power</button>
        <button name="%" onClick={handleClick} id="mod">%</button>
        <button name="√" onClick={handleClick} id="root">√x</button>
        <button name="x²" onClick={handleClick} id="sqrt">x²</button>
        <button name="/" onClick={handleClick} id="divide">/</button>
        <button name="7" onClick={handleClick}>7</button>
        <button name="8" onClick={handleClick}>8</button>
        <button name="9" onClick={handleClick}>9</button>
        <button name="*" onClick={handleClick} id="multiply">x</button>
        <button name="4" onClick={handleClick}>4</button>
        <button name="5" onClick={handleClick}>5</button>
        <button name="6" onClick={handleClick}>6</button>
        <button name="-" onClick={handleClick} id="subs">-</button>
        <button name="1" onClick={handleClick}>1</button>
        <button name="2" onClick={handleClick}>2</button>
        <button name="3" onClick={handleClick}>3</button>
        <button name="+" onClick={handleClick} id="add">+</button>
        <button name="0" onClick={handleClick}>0</button>
        <button name="." onClick={handleClick}>.</button>
        <button id="result" onClick={calculateResult}>=</button>
      </div>
    
    </div>
  );
}
export default Calculator;