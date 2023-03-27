import React, {useRef,useState} from 'react';
import './datefunction.css';

function Datefunction() 
{
    const [result,setResult]=useState("");
    const [datef, setDate] = useState('');
    const [seconddate,setSeconddate]=useState('');
    const dateInputRef = useRef(null);
    console.log(datef);
    console.log(seconddate);
    var date1=datef.split(/[-]/);
    const year1=date1[0];
    const month1=date1[1];
    const fdate=date1[2];
    //const firstdate={year1,month1,fdate};
    //console.log(firstdate);
    var date2=seconddate.split(/[-]/);
    const year2=date2[0];
    const month2=date2[1];
    const sdate=date2[2];
    const secdate={year1,year2,month1,month2,fdate,sdate};
    console.log(secdate);
    const handleChange = (e) => {
    setDate(e.target.value);
    }

    const handleChange1 =(e) =>{
      setSeconddate(e.target.value);
    }
    function calculatedifference()
    {
      fetch("http://localhost:8080/calculator/datedifference",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(secdate),
    }).then(res =>res.json()).then((result) =>setResult(result));
    }
  return (
    <div className='date' style={{"textAlign":"center"} }>
      <input type="date" onChange={handleChange} ref={dateInputRef}/>
      <p>To</p>
      <input type="date" onChange={handleChange1} ref={dateInputRef}/>
      <br></br>
      <button onClick={calculatedifference}>Difference</button>
      <br></br>
      <input type="text" value={result}></input>
    </div>
  );
}
export default Datefunction;