<template>
  <div>
    <div>
      <ImportExcel @jsonAvailable="jsonAvailable($event)" />
    </div>
    <div id="tree" ref="tree"></div>
  </div>
</template>

<style type="text/css">
.orgchart {
  background: #fff;
}

.orgchart-container {
  height: 900px;
}
</style>

<script>
/* eslint-disable */
import Vue from "vue";
import ImportExcel from "@/components/ImportExcel";
import { OrgViewerNode } from "../data/data";

import OrgChart from '@balkangraph/orgchart.js'


console.log(this)

export default {

  name: 'tree',

  data() {
    return {
        nodes: [
            { id: 1, name: "Denny Curtis", title: "CEO", img: "https://cdn.balkan.app/shared/2.jpg" },
            { id: 2, pid: 1, name: "Ashley Barnett", title: "Sales Manager", img: "https://cdn.balkan.app/shared/3.jpg" },
            { id: 3, pid: 1, name: "Caden Ellison", title: "Dev Manager", img: "https://cdn.balkan.app/shared/4.jpg" },
            { id: 4, pid: 2, name: "Elliot Patel", title: "Sales", img: "https://cdn.balkan.app/shared/5.jpg" },
            { id: 5, pid: 2, name: "Lynn Hussain", title: "Sales", img: "https://cdn.balkan.app/shared/6.jpg" },
            { id: 6, pid: 3, name: "Tanner May", title: "Developer", img: "https://cdn.balkan.app/shared/7.jpg" },
            { id: 7, pid: 3, name: "Fran Parsons", title: "Developer", img: "https://cdn.balkan.app/shared/8.jpg" }
        ]
    }
  },

  methods: {

    mytree: function(domEl, x) {
        this.chart = new OrgChart (domEl, {
            nodes: x,
            nodeBinding: {
                field_0: "name",
                img_0: "img"
            }
        });
    },

    jsonAvailable(json) {
      let nodes = [];
      console.log({ json: json });
      for (let index = 1; index < json.length; index++) {
        const element = json[index];
        let n = new OrgViewerNode(
          "",
          element[0],
          element[1],
          element[2],
          element[3],
          ""
        );
        nodes.push(n);
      }
      var arrayToTree = require("array-to-tree");
      var tree = arrayToTree(nodes, {
        parentProperty: "reportsTo",
        customID: "name"
      });
      console.log({ tree: tree });
      this.ds = tree[0];
    },
    mounted(){
      console.log("mounted")
      this.mytree(this.$refs.tree, this.nodes)
    }
    
  }
};
</script>
