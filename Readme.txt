heroku create wb-algamoney-api

heroku addons:create jawsdb

heroku config:set JDBC_DATABASE_URL=jdbc:mysql://t89yihg12rw77y6f.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/hodk5gd6qxl263a6 JDBC_DATABASE_USERNAME=l7re1iqbir2jxp1a JDBC_DATABASE_PASSWORD=drimtxc8bfjmwhev
