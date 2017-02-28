function init(foamtree, ambituri) {
$.ajax({
  url: ambituri,
  dataType: "json",
  jsonpCallback: "callback",
  success: function(data) {

		var groups = mapfacet(data.facet);
		
    foamtree.set({
      dataObject: { groups: groups },
      rolloutDuration: 3000
    });
  },
	error: function (xhr, ajaxOptions, thrownError) {
		   foamtree.set({
      		dataObject: { groups: [{label: (xhr.status + " " + thrownError)}]},
      		rolloutDuration: 3000
    		});
  }
});
}

function initlocal(foamtree, data) {
	
		var groups = mapfacet(data);
		
    foamtree.set({
      dataObject: { groups: groups },
      rolloutDuration: 3000
    });
}

function mapfacet(data) {
	var topgroup = {  };

	$.each(data,function(index,facet) {
      var group =  {
        label: facet.value,
        weight: facet.count,
        groups : [
        	{label : "Substances", weight : facet.substancescount },
        	{label : "Measurements", weight : facet.count}
        ],
        uri : facet.uri
      };    	
    	var subcategory = topgroup[facet.subcategory];
    	var nmtypelabel = lookup[facet.subcategory]
    	if (subcategory === undefined) {
    		topgroup[facet.subcategory] = 
        	{label : nmtypelabel===undefined?facet.subcategory:nmtypelabel, 
        	 weight : facet.count, groups: [group],
        	 uri : facet.subcategoryuri,
        	 exposed : true
        	};
      } else {
      	   subcategory.weight += facet.count;	
      	   subcategory.groups.push(group);
      };
    });
		var groups = [];
		$.each(topgroup,function (index,element) {
				groups.push(element);
	  });	
	  return groups;
}