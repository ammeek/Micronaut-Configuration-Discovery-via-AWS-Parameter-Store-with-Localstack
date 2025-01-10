#!/bin/bash
awslocal ssm put-parameter --name /config/micronautguide/vat/country --value=Spain --type String --region eu-west-1
awslocal ssm put-parameter --name /config/micronautguide/vat/rate --value=21.0 --type String --region eu-west-1