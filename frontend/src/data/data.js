/* eslint-disable */
export class OrgViewerNode {
    constructor(id, name, title, team, reportsTo, className) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.team = team;
        this.reportsTo = reportsTo;
        this.className = className;
        this.children = [];
     }

     log(){
        console.log({node:this});
     }
}
