const fs = require('fs');

//const colors = ["black","blue","brown","cyan","green","light_blue","light_gray","lime","magenta","orange","pink","purple","red","white","yellow"]

const data = fs.readdirSync('./');

data.forEach((x) => {
	if (x == 'x.js') return;

	let y = x.replace('.json', '');

	let s = y.replace('stained_', '').replace('_pane', '');

	const text = `
	{
		"type": "minecraft:block",
		"pools": [
		  {
			"rolls": 1,
			"entries": [
			  {
				"type": "minecraft:alternatives",
				"children": [
				  {
					"type": "minecraft:item",
					"conditions": [
					  {
						"condition": "minecraft:match_tool",
						"predicate": {
						  "enchantments": [
							{
							  "enchantment": "minecraft:silk_touch",
							  "levels": {
								"min": 1
							  }
							}
						  ]
						}
					  }
					],
					"name": "minecraft:${y}"
				  },
				  {
					"type": "minecraft:item",
					"conditions": [
					  {
						"condition": "minecraft:match_tool",
						"predicate": {
						  "item": "glassy:glass_cutter"
						}
					  }
					],
					"name": "minecraft:${y}"
				  },
				  {
					"type": "minecraft:item",
					"conditions": [
					  {
						"condition": "minecraft:survives_explosion"
					  }
					],
					"name": "glassy:${s}_shard"
				  }
				]
			  }
			]
		  }
		]
	  }
	`;

	fs.writeFileSync(`${x}`, text);
});
