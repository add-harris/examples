
function printSomething() {
    console.log("something")
}

function getImgResource(image) {
    return require(`../assets/images/${image}`)
}

export { printSomething, getImgResource };
