import Header from './components/header.jsx';
import Navigation from './components/navigation.jsx';
import { UsersContainer } from './components/users-container.jsx';
import './App.css';
import ProfileContainer from "./components/Profile/profile-container.jsx"
import { Routes, Route } from "react-router-dom";
import Registration from './components/reqistration.jsx';
function App(props) {
   return (
      <div className='wrapper'>
         <Header />
         <Navigation />
         <div className="main-content">
            <Routes>
               <Route path="/" element={<ProfileContainer/>} />
               <Route path="/profile/*" element={<ProfileContainer/>} />
               <Route path="/registration/*" element={<Registration/>}/>
               <Route path="/users/*" element={<UsersContainer/>}/>
            </Routes>
         </div>
      </div>
   );
}

export default App;
