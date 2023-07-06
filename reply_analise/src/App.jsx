import './css/App.css';
import Header from './modules/header';
import SubscribeContainer from './modules/container_subscribe';
import Channels from './modules/channels';
import Notice from './modules/notice';
import { Route, Routes } from 'react-router-dom';
import AutorizationContainer from './modules/container_autorization';
import NewReport from './modules/newReport';
import StatsContainer from './modules/container_stats';
function App(props) {
  return (
    <div className="main-container">
         <Header />
         <Routes>
            <Route path="/" element={<SubscribeContainer />}/>
            <Route path="/subscribe/*" element={<SubscribeContainer />}/>
            <Route path="/channels/*" element={<Channels />} />
            <Route path="/notice/*" element={<Notice />} />
            <Route path="/stats/*" element={<StatsContainer />} />
            <Route path="/autorization" element={<AutorizationContainer />} />
            <Route path="/newreport" element={<NewReport />} />
         </Routes>
    </div>
  );
}

export default App;
