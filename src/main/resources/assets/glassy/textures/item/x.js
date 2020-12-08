const fs = require('fs');

const colors = ["black","blue","brown","cyan","green","light_blue","light_gray","lime","magenta","orange","pink","purple","red","white","yellow"]


const data = fs.readFileSync('glass_shard.png')


colors.forEach((x) => {
	fs.writeFileSync(`${x}_glass_shard.png`, data)
})