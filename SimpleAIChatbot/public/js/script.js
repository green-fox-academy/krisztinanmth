// invoke an instance of SpeechRecognition
const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
const recognition = new SpeechRecognition();

recognition.lang = 'en-US';
recognition.interimResults = false;

// instantiate Socket.IO
const socket = io();

// capture the DOM reference for the button, and listen for the click event to initiate speech recognition
document.querySelector('button').addEventListener('click', () => {
  recognition.start();
});

// now that the recohnition has started, use the result event to retrieve what was said as text
recognition.addEventListener('result', (e) => {
  let last = e.results.length - 1;
  let text = e.results[last][0].transcript;

  console.log('Confidence: ' + e.results[0][0].confidence);

  // Socket.IO is a library for real-time web applications....it enables real-time bidirectional communication
  // between web clients and servers
  socket.emit('chat message', text);
});
