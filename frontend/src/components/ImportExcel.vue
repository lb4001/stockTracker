<template>
  <div>
    <label>
      <input
        type="file"
        id="files"
        ref="files"
        v-on:change="handleFilesUpload()"
      />
    </label>
  </div>
</template>

<script>
/* eslint-disable */
import Vue from "vue";
import XLSX from "xlsx";

export default {
  name: "ImportExcel",
  data() {
    return {
      files: []
    };
  },

  methods: {
    addFiles() {
      this.$refs.files.click();
    },

    handleFilesUpload() {
      let uploadedFiles = this.$refs.files.files;

      if (uploadedFiles.length == 0) {
        return;
      }

      console.log(uploadedFiles);

      for (var i = 0; i < uploadedFiles.length; i++) {
        this.files.push(uploadedFiles[i]);
      }

      var f = uploadedFiles[0];
      var reader = new FileReader();
      var self = this;
      reader.onload = function(e) {
        var data = e.target.result;
        data = new Uint8Array(data);
        var workbook = XLSX.read(data, {
          type: "array"
        });

        /* DO SOMETHING WITH workbook HERE */
        var first_sheet_name = workbook.SheetNames[0];
        /* Get worksheet */
        var worksheet = workbook.Sheets[first_sheet_name];
        //It will prints with header and contents ex) Name, Home...
        var json = XLSX.utils.sheet_to_json(worksheet, {
          header: 1
        });
        console.log(json);
        console.log(this);
        self.$emit('jsonAvailable', json)
      };
      reader.readAsArrayBuffer(f);
    },

    removeFile(key) {
      this.files.splice(key, 1);
    }
  }
};
</script>
