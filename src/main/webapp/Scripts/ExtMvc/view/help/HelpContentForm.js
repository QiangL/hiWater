Ext.define('SinoydFramework.view.help.HelpContentForm', {
    extend: 'Ext.form.Panel',
    layout: 'anchor',
    frame: true,
    alias: 'widget.helpHelpContentForm',
    border: false,
    bodyPadding: '5 5 5 5',
    defaultType: 'textfield',
    fieldDefaults: {
        labelAlign: 'left',
        labelWidth: 75
    },
    initComponent: function () {
        this.items = [{
            xtype: 'textareafield',
            labelWidth:75,
            name: 'HelpContent',
            fieldLabel: '内容',
            listeners: {
                afterrender: function () {
                    var textarea = this.getEl().dom.childNodes[1].childNodes[0];
                    if (textarea) {
                        $('#' + textarea.id).xheditor({ tools: 'Cut,Copy,Paste,Pastetext,|,Blocktag,Fontface,FontSize,Bold,Italic,Underline,Strikethrough,FontColor,BackColor,|,SelectAll,Removeformat,Align,List,Outdent,Indent,|,Link1,Unlink1,Anchor1,Img,Flash1,Media1,|,Hr,Emot,Table,|,Preview',
                            skin: 'vista', width: 450, height: 250,
                            upImgUrl: UrlConvert("Attachment/XhEditorUpload"), upImgExt: "jpg,jpeg,gif,png",
                            editorRoot: UrlConvert('Content/Resource/xheditor/'),
                            localUrlTest: /^https?:\/\/[^\/]*?(xheditor\.com)\//i,
                            remoteImgSaveUrl: UrlConvert("Attachment/XhEditorRemoteImgUpload")
                        });
                    }
                }
            }
        }],
        this.callParent(arguments);
    }
});