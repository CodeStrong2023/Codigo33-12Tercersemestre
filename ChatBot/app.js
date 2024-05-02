
const { GoogleGenerativeAI } = require("@google/generative-ai");
const clave = require("./Clave.JS");

document.getElementById("botonGuardar").addEventListener("click", function() {
    var textoIngresado = document.getElementById("textoEntrada").value;
    // Acá se guarda el texto
});

// Access your API key as an environment variable (see "Set up your API key" above)
const genAI = new GoogleGenerativeAI(clave); //Aca le paso la clave Api key

// ...

const model = genAI.getGenerativeModel({ model: "MODEL_NAME"}); 


async function run() {
    // For text-only input, use the gemini-pro model
    const model = genAI.getGenerativeModel({ model: "gemini-pro"});
  
    const chat = model.startChat({
      history: [
        {
          role: "user",
          parts: [{ text: "Hola" }],//Cambiar esto por una entrada de texto
        },
        {
          role: "model",
          parts: [{ text: "Bienvenido, cuentame ¿Cómo te sientes? " }],//Poner algo acorde
        },
      ],
      generationConfig: {
        maxOutputTokens: 100,
      },
    });
    //Crear el boton para salir del chat y listo        POR HACER
    //Agregar un while para que se repita el texto      POR HACER

    const msg = textoIngresado ;
    //textoingresado llama a la variable de arriba creada y traida del index
  
    const result = await chat.sendMessage(msg);
    const response = await result.response;
    const text = response.text();
    console.log(text);
  }
  
  run();


