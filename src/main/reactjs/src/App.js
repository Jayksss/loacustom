import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function App() {
	axiosProxy();
	return (
		<div className="App">
			<header className="App-header">
				<img src={logo} className="App-logo" alt="logo" />
				<p>
					Edit <code>src/App.js</code> and save to reload.
				</p>
				<a className="App-link" href="https://reactjs.org" target="_blank" rel="noopener noreferrer">
					Learn React
				</a>
			</header>
		</div>
	);
}

const axiosProxy = () => {
    axios.get('/api/DB-CONNECT-TEST') // proxy 처리를 했으므로 도메인 제외하고 입력
        .then(res => (
			console.log(res)
		))
        .catch(e => (
			console.log(e)
		));
};

export default App;
