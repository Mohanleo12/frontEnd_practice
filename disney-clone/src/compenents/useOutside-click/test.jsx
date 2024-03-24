import { useRef, useState } from "react";
import useOutsideClick from ".";

export default function UseOnClickOutside() {
    const ref = useRef()
    useOutsideClick(ref, () => setShowContent(false))
  const [showContent, setShowContent] = useState(false);

  return (
    <center>
      <div className="onclick">
        {showContent ? (
          <div ref={ref}>
            <h1>This is a random content</h1>
            <p>
              If you click inside the content It won't close so please click
              outside the content
            </p>
          </div>
        ) : (
          <button onClick={() => setShowContent(true)}>show content</button>
        )}
      </div>
    </center>
  );
}
