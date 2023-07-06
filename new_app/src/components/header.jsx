import image from "../images/fish.svg";
import img from "../images/profile.svg";
function Header(props) {
   return (
      <header className='header'>
         <img className=".fish" src={image} alt=""></img>
         <a href="registration" className = "profReg"><img src={img} alt=""/></a>
      </header>
   )
};
export default Header;