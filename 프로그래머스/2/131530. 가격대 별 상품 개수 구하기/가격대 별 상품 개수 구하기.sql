SELECT TRUNC(PRICE / 10000, 0) * 10000 AS PRICE_GROUP, COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY TRUNC(PRICE / 10000, 0) * 10000
ORDER BY PRICE_GROUP;