//let searchField = document.getElementById("search");
let timerID = 0;

function search(text) {
    clearInterval(timerID); // останавливает таймер по его идентификатору
    timerID = setTimeout(() => {
        sendRequest(text);
    }, 500);
}

function sendRequest(text) {
    console.log(`request: ${text} sended`);
}