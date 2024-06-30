import { GoogleGenerativeAI } from "@google/generative-ai";
const clave = require("./Clave.JS");

// Access your API key as an environment variable (see "Set up your API key" above)
const genAI = new GoogleGenerativeAI(clave); //Aca le paso la clave Api key

// ...

const model = genAI.getGenerativeModel({ model: "MODEL_NAME"}); 


async function run(msg) {
    // For text-only input, use the gemini-pro model
    const model = genAI.getGenerativeModel({ model: "gemini-pro"});
  
    const chat = model.startChat({
      history: [
        {
          role: "user",
          parts: [{ text: "Hola" }],
        },
        {
          role: "model",
          parts: [{ text: "Bienvenido, cuentame ¿Cómo te sientes? " }],
        },
      ],
      generationConfig: {
        maxOutputTokens: 100,
      },
    });
    //textoingresado llama a la variable de arriba creada y traida del index
    const result = await chat.sendMessage(msg);
    const response = await result.response;
    const text = response.text();
    console.log(text);
  }
