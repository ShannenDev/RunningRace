insert into runner_entity (id, name, age, gender) values ('d10ba8c3-2605-4372-a8a5-228b93b6883f', 'Sarah Johnson', 29, 'FEMALE');
insert into runner_entity (id, name, age, gender) values ('2d98bb57-6036-4621-9a82-ad42bc623502', 'David Rodriguez', 35, 'MALE');
insert into runner_entity (id, name, age, gender) values ('37c650ef-c9f2-4f64-96f6-9f523f27f927', 'Emily Chen', 25, 'FEMALE');
insert into runner_entity (id, name, age, gender) values ('698f16c6-fa03-4506-b3ea-6b1399d16fc1', 'Michael Thompson', 42, 'MALE');

insert into race_entity (id, name, distance) values ('99846c31-8b42-44ee-a2d3-243341a4b54e', 'Sunset Sprint', 10.25);
insert into race_entity (id, name, distance) values ('931cbd31-8c02-4316-838f-4a4b8ffbefe2', 'Mountain Majesty Marathon', 42.0);

insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('c8f0fa3a-ac3a-4691-8596-6512f136171e', '99846c31-8b42-44ee-a2d3-243341a4b54e', 'd10ba8c3-2605-4372-a8a5-228b93b6883f', 45.23);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('ed472f8c-5dab-459f-9e96-f41d9c684c1c', '99846c31-8b42-44ee-a2d3-243341a4b54e', '2d98bb57-6036-4621-9a82-ad42bc623502', 50.41);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('f777b9cc-8a93-40f6-80d7-d032b60a0de9', '99846c31-8b42-44ee-a2d3-243341a4b54e', '37c650ef-c9f2-4f64-96f6-9f523f27f927', 55.35);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('3c54b4e3-d3c3-4a6e-86e3-fbc2adef7b16', '99846c31-8b42-44ee-a2d3-243341a4b54e', '698f16c6-fa03-4506-b3ea-6b1399d16fc1', 60.14);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('fb849e70-9318-4e0a-9a67-979f1ae88666', '931cbd31-8c02-4316-838f-4a4b8ffbefe2', 'd10ba8c3-2605-4372-a8a5-228b93b6883f', 204.13);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('2ae50dab-e98c-4238-be0e-e8a252b1ab32', '931cbd31-8c02-4316-838f-4a4b8ffbefe2', '2d98bb57-6036-4621-9a82-ad42bc623502', 223.45);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('05893c71-b5f5-4282-acdc-5b286133f7fd', '931cbd31-8c02-4316-838f-4a4b8ffbefe2', '37c650ef-c9f2-4f64-96f6-9f523f27f927', 242.36);
insert into result_entity (id, race_entity_id, runner_entity_id, time) values ('7215c038-b6ec-431f-94ee-4f6528028503', '931cbd31-8c02-4316-838f-4a4b8ffbefe2', '698f16c6-fa03-4506-b3ea-6b1399d16fc1', 260.41);
