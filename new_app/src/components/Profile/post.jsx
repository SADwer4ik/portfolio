import logo from "../../images/main_logo.jpg";
function Post(props) {
   return (
      <div className="post">
         <img src={logo} />
         <h2>{props.name}</h2>
         <span>{props.message}</span>
      </div>
   );
}
export default Post;