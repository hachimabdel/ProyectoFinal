INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (1,'Frigoríficos', null);
INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (2,'Lavadoras',null);
INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (3,'Lavavajillas',null);
INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (4,'Hornos',null);


INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (5,'Frigorífico americano - Samsung','Frigorífico americano - Samsung RS68A8522S9/EF, No Frost, 634 l, Dispensador hielo y agua, 178 cm, Inox',1353, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_97545759/fee_786_587_png',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (6,'Frigorífico americano - LG','Frigorífico americano - LG GSLV50PZXE, No Frost, 635 L, Serie 500, Compresor Inverter Linear, Plata',1177, 0.09,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_99210862/fee_786_587_png',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (7,'Frigorífico americano - LG','Frigorífico americano - LG GSXV80PZLE Instaview, No Frost, 635 l, Acero Inoxidable',1933, 0.13,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_95971574/fee_786_587_png',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (8,'Lavadora - LG 9 Kg','Lavadora carga frontal - LG F4WV309S6WA, 9 Kg, 1400 rpm, 14 programas, Blanco', 530, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_100870864/fee_786_587_png',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (9,'Lavadora - Bosch 9 kg','Lavadora carga frontal - Bosch WGG14201ES, 9 kg, 1200 rpm, 15 programas, Blanco',460, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_95881740/fee_786_587_png',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (11,'Lavadora - LG 9kg','Lavadora carga frontal - LG F4WV7009S1W, 9kg, 1400 rpm, 14 Programas, Turbowash, Serie 700, Blanco',420, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_99213484/fee_786_587_png',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (12,'Lavavajillas - Beko','Lavavajillas - Beko BDFN36640XC, Independiente, 6 programas, 60 cm, 42 dB(A), Motor ProSmart Inverter HygieneIntense, Inox',358, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_102645483/fee_786_587_png',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (13,'Lavavajillas - Fagor','Lavavajillas - Fagor 3LVF-623.1X, Independiente, 12 servicios, 6 programas, ShineDose, EnergySave, 60 cm, Plata',349, 0.08,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_91560059/fee_786_587_png',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (14,'Lavavajillas - AEG','Lavavajillas - AEG FFB53910ZM, 14 servicios, 5 programas, 60 cm, 46 dB, Inox',485, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_92356435/fee_786_587_png',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (15,'Horno - Bosch','Horno - Bosch HBA512ES0, Multifunción, Hidrolítico, 70 l, Acero inoxidable',329, 0.06,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_82878533/fee_786_587_png',4);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (16,'Horno - Siemens','Horno - Siemens HB514AER0, Multifunción (7), 71 L, Función grill, perfectCooking 3D, Clase A, Negro',399, 0,'https://assets.mmsrg.com/isr/166325/c1/-/pixelboxx-mss-79265662/fee_786_587_png',4);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (17,'Horno - AEG','Horno - AEG BPS335160M, 71 l, Multifunción, Independiente, Pirolítico, 60 cm, A+, Inox Antihuellasç',449, 0,'https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_98306691/fee_786_587_png',4);

ALTER SEQUENCE hibernate_sequence RESTART WITH 1000;

