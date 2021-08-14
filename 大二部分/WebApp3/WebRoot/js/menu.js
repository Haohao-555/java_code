function init(){	
	$( '.title' ).each( function(i){
		console.log( this );
		$( this ).click( onItemClick );
	} );
}

var flag = false;
var index = -1;
function onItemClick(){
	if( !flag ){		
		var $obj = $( this );	
		var newIndex = $( '.item' ).index( $obj.parent() );				
		if( index!=newIndex && index!=-1 ){
			var $lastItem = $( ".item" ).eq( index );   //class="item"	
			var $div = $lastItem.find( 'div' );
			$div.removeClass( "on" );
			var $ul = $lastItem.find( 'ul' );
			$ul.slideUp();
		}
		$obj.addClass( 'on' );
		$obj.next().slideToggle( func );
		flag = true;
		index = newIndex;
	}
}

function func(){
	console.log( "func" );
	flag = false;
}