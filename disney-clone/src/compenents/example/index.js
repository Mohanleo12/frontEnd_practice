import { useEffect, useRef, useState } from "react";
import axios from "axios";

const Example = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyjson.com/products")
      .then(response => setData(response.data));
  }, []);
  return (
    <center>
      {
        data.map(item => <li key={item.id} >{item.title}</li>)
      }
    </center>
  );
}

export default Example;


