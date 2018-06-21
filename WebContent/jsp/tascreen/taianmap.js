var TaianMapUtil = (function(){
	var taian = {};
	var option = {
		tooltip : {
		        trigger: 'item'
	    },
	    geo: {
	        map: 'taian',
	        label: {
	            emphasis: {
	                show: false
	            }
	        },
	        roam: false,
	        itemStyle: {
	            normal: {
	                areaColor: '#3092E7',
	                borderColor: '#eeeeee'
	            },
	            emphasis: {
	                areaColor: '#46bee9'
	            }
	        }
	    },
	    visualMap: {
	    	show:false,
            min: 0,
            text:['高','低'],
            realtime: false,
            calculable: true,
            inRange: {
            	color: ['lightskyblue','yellow', 'orangered']
            },
			textStyle:{
				color:'#FFFFFF'
			}
        },
	    series: [{
	    	name:'登记情况',
	        type: 'map',
	        map: 'taian',
	        label:{
        		normal:{
        			show:true,
        			textStyle:{
        				color:'#FFFFFF'
        			}
        		}
	        },
	        data:[{name:'新泰市',value:0},{name:'岱岳区',value:0},
	        	{name:'泰山区',value:0},{name:'宁阳县',value:0},
	        	{name:'肥城市',value:0},{name:'东平县',value:0}]
	    }],
	};
	taian.getOption = function(){
		return option;
	};
	return taian;
})();