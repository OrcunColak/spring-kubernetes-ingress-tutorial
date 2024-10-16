# Read me

The original idea is from  
https://medium.com/@Teqmonic/kubernetes-ingress-controller-with-spring-boot-0b2e55d63804
```
cd product-api
mvn clean install
docker build -f .\Dockerfile . -t product-api:1.0
```
then
```
cd promotion-api
mvn clean install
docker build -f .\Dockerfile . -t promotion-api:1.0
```
then
```
cd k8s
kubectl apply -f 1-product-api.yaml
kubectl apply -f 2-promotion-api.yaml
kubectl apply -f 3-ingress-api.yaml
```
then
http://localhost/promotions/api/promotions 
http://localhost/products/api/products

kubectl delete ingress instacart-api-ingress

kubectl delete service product-api-service
kubectl delete deployment product-api-deployment

kubectl delete service promotion-api-service
kubectl delete deployment promotion-api-deployment
