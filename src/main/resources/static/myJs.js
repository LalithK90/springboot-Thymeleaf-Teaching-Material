document.ready(function () {
    //AJAX FUNCTION CALL
    async function getData(url) {
        try {
            const result = await
                fetch(url);
            return await
                result.json();
        } catch (e) {
            console.log("Error : " + e);
            conformationAndLoginWindow();

        }
    }

    Promise.resolve(getData(`${selectedProvince}`).then(data => givenData = data)
).
    then(function (val) {
        for (let i = 0; i < val.length; i++) {
            let elementId = document.getElementById('district');
            let opt = document.createElement('option');
            opt.innerHTML = val[i].district;
            opt.value = val[i].name;
            elementId.appendChild(opt);
        }
    });


});