var path = require('path');
var Tesseract = require('tesseract.js')
var image = path.resolve(__dirname, 'sample.jpg');

Tesseract.recognize(image,{
	lang: 'eng',
})
.then(data => {
	console.log('then\n', data.text)
})
.catch(err => {
  console.log('catch\n', err);
})
.finally(e => {
  console.log('finally\n');
});