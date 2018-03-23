











//定义柱状图图片base64编码的全局变量
var barBase64Info;

function echar(){//柱状图
    var myChart = echarts.init(document.getElementById('histogram'));

    $.post('...',{},function (data) {
        //...
        var option = {
            //...
        };
        myChart.setOption(option);
        //用getDataURL()将柱状图转义成base64编码赋给全局变量
        barBase64Info = myChart.getDataURL();
    }, 'json');
}



//下面根据你们自己的代码，点击按钮的时候将barBase64Info同时提交给后台接收就行了
