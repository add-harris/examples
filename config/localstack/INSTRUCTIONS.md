# LocalStack

Start local stack with `docker-compose up`

The configuration for localstack has already been done in the modified docker-compose.yml. 
This specifies to start only S3 & handles the volume mounts - mapping the tmp dir in local stack to physical dir on this machine
to persist the data in S3. 

# aws-cli & S3

(Note: aws-cli is meant to only work in virtualenv, but seems to be working currently outside of virtualenv with localstack.
If connecting to real aws may need to use aws-cli in virtualenv - see katas/virtualenv/INSTRUCTIONS.md)

## First must be logged into aws with aws-exuser

These instructions use `aws-l` which is an alias for `aws --endpoint-url=http://localhost:4572` to point at localstack.

### Make bucket

`aws-l s3 mb s3://car-service/`

### Copy file

`aws-l s3 cp loading.gif s3://car-service/images/`

### List files in path

`aws-l s3 ls s3://car-service/images/`
