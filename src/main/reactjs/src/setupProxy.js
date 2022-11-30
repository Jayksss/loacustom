const {createProxyMiddleware} = require('http-proxy-middleware');

module.exports = function (app) {
    app.use(
        createProxyMiddleware('/api', { // context를 포함하는 요청은 proxy 처리
            target: 'http://localhost:5050', // 서버 url
            changeOrigin: true
        })
    )
};