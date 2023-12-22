curl -ikL -X POST localhost:8080/auth/signup -H 'Content-Type: application/json' -d '{"email":"email@email.com","password": "abcd"}'

curl -ikL -X POST localhost:8080/auth/login -H 'Content-Type: application/json' -d '{"email":"email@email.com","password": "abcd"}'

curl -ikL -X POST localhost:8080/auth/logout -H 'Content-Type: application/json' -d '{"token":"eyJhbGciOiJIUzI1NiJ9.eyJjcmVhdGVkQXQiOjE3MDMyNzE3OTI2MjIsInJvbGVzIjpbW11dLCJleHBpcnlBdCI6MTcwNTg2Mzc5MjYwOCwiZW1haWwiOiJhYmhpaml0LmJlakBnbWFpbC5jb20iLCJleHAiOjE3MDU4NjM3OTJ9.Vg61ROatF6LipDEcnR_yTpXFtpuLHjUQLIkg0CsWm2c","userId": "1"}'