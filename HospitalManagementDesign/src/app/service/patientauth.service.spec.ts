import { TestBed } from '@angular/core/testing';

import { PatientauthService } from './patientauth.service';

describe('PatientauthService', () => {
  let service: PatientauthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientauthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
