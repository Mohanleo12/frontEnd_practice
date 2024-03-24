import { useState } from "react";
import QRCode from "react-qr-code";
import "./styles.css";

export default function QRCodeGenerator() {
  const [qrCode, setQrCode] = useState("");
  const [input, setInput] = useState("");

  function handleGenarate() {
    setQrCode(input);
    setInput("");
  }

  return (
    <div className='container'>
      <h1> QR Code Generator</h1>
      <div>
        <input
          onChange={(e) => setInput(e.target.value)}
          type='text'
          name='qr-code'
          value={input}
          placeholder='Enter your value here'
        />
        <button
          disabled={input && input.trim() !== "" ? false : true}
          onClick={handleGenarate}>
          Genarate
        </button>
      </div>
      <div>
        <QRCode
          id='qr-code-value'
          value={qrCode}
          size={300}
          bgColor='#fff'
        />
      </div>
    </div>
  );
}


