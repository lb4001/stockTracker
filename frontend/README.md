# org-viewer

Creates an visual org chart from an excel file

## Main Libraries Used
- https://vuejs.org/ (v2)
- https://bootstrap-vue.org/
- https://github.com/dabeng/vue-orgchart
   - https://github.com/dabeng/OrgChart
- https://vue-xlsx.netlify.app/guide/#installation

https://gist.github.com/qkreltms/564332f2460a5899a7573b8d7510b0d2

## Excel file format
- Columns
   - Name
   - Title
   - Team
   - ReportsTo (Must match data in the name column)
   - CssClass

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).
