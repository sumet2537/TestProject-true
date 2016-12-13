$(document).ready(function () {
//    $('#contact_form').bootstrapValidator({
    $('#registerForm').bootstrapValidator({
// To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            u_username: {
                validators: {
                    stringLength: {
                        min: 8,
                        max: 10
                    },
                    notEmpty: {
                        message: 'กรุณาใส่ ชื่อเข้าใช้ระบบ 8 ตัว'
                    }
                }
            },
            u_password: {
                validators: {
                    stringLength: {
                        min: 8,
                        max: 10
                    },
                    notEmpty: {
                        message: 'กรุณาใส่รหัสผ่านอย่างน้อย 8 ตัว'
                    }
                }
            },
            
            citizen_id: {
                validators: {
                    stringLength: {
                        min: 13
                    },
                    notEmpty: {
                        message: 'กรุณาใส่ กรอกเลขบัตรประจำตัวประชาชน !'
                    }
                }
            },
            username: {
                validators: {
                    stringLength: {
                        min: 5,
                        max: 20
                    },
                    notEmpty: {
                        message: 'กรุณาใส่รกรอกชื่อที่ใช้เข้าสู่ระบบ !'
                    }
                }
            },
            password: {
                validators: {
                    stringLength: {
                        min: 8,
                        max:20
                    },
                    notEmpty: {
                        message: 'กรุณาใส่รหัสกรอกรหัสผ่านที่จะใช้เข้าสู่ระบบ!'
                    }
                }
            },
            title_type: {
                validators: {
                    stringLength: {
                        min: 4
                    },
                    notEmpty: {
                        message: 'กรุณาเลือกคำนำหน้าของคุณ!'
                    }
                }
            },
                firstName: {
                validators: {
                    stringLength: {
                        min: 5
                    },
                    notEmpty: {
                        message: 'กรุณากรอกชื่อของคุณ!'
                    }
                }
            },
            lastName: {
                validators: {
                    stringLength: {
                        min: 5
                    },
                    notEmpty: {
                        message: 'กรุณากรอกนามสกุลของคุณ'
                    }
                }
            },
                birthdate: {
                validators: {
                    stringLength: {
                        min: 5
                    },
                    notEmpty: {
                        message: 'กรุณาเลือกวันเกิดของคุณ !'
                    }
                }
            },
                age: {
                validators: {
                    stringLength: {
                        max: 3
                    },
                    notEmpty: {
                        message: 'กรุณากรอกอายุของคุณ !'
                    }
                }
            },
              statustype: {
                validators: {
                    stringLength: {
                        max: 3
                    },
                    notEmpty: {
                        message: 'กรุณาเลือกสถานะของคุณ !'
                    }
                }
            },
            mobile: {
                validators: {
                    notEmpty: {
                        message: 'กรุณาหรอกเบอร์โทรของคุณ'
                    },
                    phone: {
                        country: 'US',
                        message: 'กรุณากรอกเบอร์ตัวเป็นตัวเลข 10 ตัว'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'กรุณาใส่อีเมล์ของคุณ'
                    },
                    emailAddress: {
                        message: 'กรุณากรอกอีเมล์ตามรูปแบบให้ถูกต้อง'
                    }
                }
            },
                addressregistration: {
                validators: {
                    notEmpty: {
                        message: 'กรุณากรอกที่อยู่ตามทะเบียนบ้าน'
                    }
                }
            },
                addresscurrent: {
                validators: {
                    notEmpty: {
                        message: 'กรุณากรอกที่อยู่ปัจจุบัน'
                    }
                }
            },
                addresssenddoc: {
                validators: {
                    notEmpty: {
                        message: 'กรุณากรอกที่จัดส่งเอกสาร'
                    }
                }
            }
        }
    })
            .on('success.form.bv', function (e) {
                $('#success_message').slideDown({opacity: "show"}, "slow") // Do something ...
                $('#contact_form').data('bootstrapValidator').resetForm();
                // Prevent form submission
                e.preventDefault();
                // Get the form instance
                var $form = $(e.target);
                // Get the BootstrapValidator instance
                var bv = $form.data('bootstrapValidator');
                // Use Ajax to submit form data
                $.post($form.attr('action'), $form.serialize(), function (result) {
                    console.log(result);
                }, 'json');
            });
});
