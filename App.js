import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import User from './pages/User';
import { ChakraProvider } from '@chakra-ui/react';
import Hr from './pages/Hr';



function App(){


  return (
  
  <ChakraProvider>
  <BrowserRouter>
  <Hr/>
  <User/>
  </BrowserRouter>
  </ChakraProvider>
  


  );
}
export default App;


