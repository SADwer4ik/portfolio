function Navigation(props) {
   return (
      <div className="navigation">
         <div className="toggle"><span></span></div>
         <ul>
            <li><a href="profile">Profile</a></li>
            <li><a href="messages">Messages</a></li>
            <li><a href="news">News</a></li>
            <li><a href="music">Music</a></li>
            <li><a href="users">Users</a></li>
            <li><a href="settings">Settings</a></li>
         </ul>
      </div>
   );
};
export default Navigation;